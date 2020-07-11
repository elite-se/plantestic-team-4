import connexion
import six

from swagger_server.models.inline_response2003 import InlineResponse2003  # noqa: E501
from swagger_server.models.plant_id import PlantId  # noqa: E501
from swagger_server import util


import mockdb.db as db
from typing import Dict

plantStorage : Dict[int, int] = {}
collectedPIDs : Dict[int, bool] = {}

def get_plant_storage(plant_type):  # noqa: E501
    """Returns the numer of Plants of plant_type that were reaped.

     # noqa: E501

    :param plant_type: The plant type to query
    :type plant_type: int

    :rtype: InlineResponse2003
    """
    if not plantStorage.get(plant_type):
        plantStorage[plant_type] = 0

    return InlineResponse2003(plantStorage[plant_type])


def notify_farmer(plantID=None, isrequest=True):  # noqa: E501
    """Tells the farmer a plant is ready to reap.

     # noqa: E501

    :param plantId: ID of plant that is ready
    :type plantId: int

    :rtype: None
    """
    print(plantID)
    if not isinstance(plantID, PlantId):
        plantID = PlantId(plantID)

    collectedPIDs[plantID.plant_id] = True

    ptype = db.getPlantType(plantID)
    if not plantStorage.get(ptype):
        plantStorage[ptype] = 1

    else:
        plantStorage[ptype] += 1 


def get_plant_storage_by_id(plantId):  # noqa: E501
    """Returns the numer of Plants of plant_type that were reaped.

     # noqa: E501

    :param plantId: The plant type to query
    :type plantId: int

    :rtype: None
    """
    # Throws an error if key is not there, should invoke 404
    collectedPIDs[plantId]
