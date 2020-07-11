import connexion
import six

from swagger_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from swagger_server.models.inline_response2002 import InlineResponse2002  # noqa: E501
from swagger_server.models.inline_response2001_foo import InlineResponse2001Foo  # noqa: E501

from swagger_server import util

import random

seasons = ["winter", "spring", "summer", "fall"]

class PlantLookUp:

    def __init__(self, *args, **kwargs):
        self.data = dict(*args, *kwargs)

    def __setitem__(self, key, val):
        self.data[key] = val

    def __getitem__(self, key):

        if not self.data.get(key):
            self.data[key] = random.randint(7, 69)
        
        return self.data.get(key)

pl = PlantLookUp()
pl[3] = 5
pl[2] = 25
pl[1] = 1

def get_season_of_plant(plant_type):  # noqa: E501
    """Find the season the plant grows in
     # noqa: E501
    :param plant_type: The plant type to query
    :type plant_type: int
    :rtype: InlineResponse2001
    """
    foo = InlineResponse2001Foo(bar="bar")
    ret = InlineResponse2001(seasons[plant_type % len(seasons)], foo)
    return ret


def get_time_to_grow_of_plant(plant_type):  # noqa: E501
    """Get the time (in days) the plant needs to grow
     # noqa: E501
    :param plant_type: The plant type to query
    :type plant_type: int
    :rtype: InlineResponse2002
    """
    return InlineResponse2002(pl[plant_type])