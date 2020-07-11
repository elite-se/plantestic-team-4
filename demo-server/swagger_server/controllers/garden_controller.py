import connexion
import six

from swagger_server.models.inline_response200 import InlineResponse200  # noqa: E501
from swagger_server.models.plant import Plant  # noqa: E501
from swagger_server import util


from swagger_server.controllers.plant_controller import get_time_to_grow_of_plant
from swagger_server.controllers.farmer_controller import notify_farmer
from typing import Dict, List
import threading
import time
import mockdb.db as db

# Map Plant type to number of seeds
seededPlants : Dict[int, int] = {}

tasks : List[threading.Thread] = []

def grow_plant(plant: Plant):
    gt = get_time_to_grow_of_plant(plant.plant_type)
    time.sleep(gt.ttgrow)
    notify_farmer(plant.plant_id, False)

def add_plant(plant_type):  # noqa: E501
    """Add a new plant to the Garden

     # noqa: E501

    :param plant_type: The plant type to query
    :type plant_type: int

    :rtype: Plant
    """
    global seededPlants
    global tasks

    if not seededPlants.get(plant_type):
        seededPlants[plant_type] = 0
    
    pid = db.addPlant(plant_type)
    plant = Plant(plant_id=pid, plant_type=plant_type)
    seededPlants[plant_type] += 1

    #clean up tasks
    tasks = [x for x in tasks if x.is_alive()]

    tasks.append(threading.Thread(target=grow_plant, args=[plant]))
    tasks[-1].start()

    return plant


def get_seeds():  # noqa: E501
    """Returns the number of seeded Plants

     # noqa: E501


    :rtype: InlineResponse200
    """
    global seededPlants

    return InlineResponse200(sum(seededPlants.values()))
