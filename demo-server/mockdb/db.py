from typing import Dict
from swagger_server.models.plant_id import PlantId

idTypeLookUp : Dict[int, int] = {}
next_plantid : int = 0

def getPlantType(plantId : PlantId):
    global idTypeLookUp
    return idTypeLookUp[plantId.plant_id]

def addPlant(plant_type : int) -> int:
    global next_plantid
    global idTypeLookUp

    pid = next_plantid
    next_plantid += 1

    idTypeLookUp[pid] = plant_type

    return pid
