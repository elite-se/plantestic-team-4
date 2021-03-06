# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class PlantId(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, plant_id: int=None):  # noqa: E501
        """PlantId - a model defined in Swagger

        :param plant_id: The plant_id of this PlantId.  # noqa: E501
        :type plant_id: int
        """
        self.swagger_types = {
            'plant_id': int
        }

        self.attribute_map = {
            'plant_id': 'plantID'
        }

        self._plant_id = plant_id

    @classmethod
    def from_dict(cls, dikt) -> 'PlantId':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The plantId of this PlantId.  # noqa: E501
        :rtype: PlantId
        """
        return util.deserialize_model(dikt, cls)

    @property
    def plant_id(self) -> int:
        """Gets the plant_id of this PlantId.


        :return: The plant_id of this PlantId.
        :rtype: int
        """
        return self._plant_id

    @plant_id.setter
    def plant_id(self, plant_id: int):
        """Sets the plant_id of this PlantId.


        :param plant_id: The plant_id of this PlantId.
        :type plant_id: int
        """
        if plant_id is None:
            raise ValueError("Invalid value for `plant_id`, must not be `None`")  # noqa: E501

        self._plant_id = plant_id
