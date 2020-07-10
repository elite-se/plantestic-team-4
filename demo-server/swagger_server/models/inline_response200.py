# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class InlineResponse200(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, seeds: int=None):  # noqa: E501
        """InlineResponse200 - a model defined in Swagger

        :param seeds: The seeds of this InlineResponse200.  # noqa: E501
        :type seeds: int
        """
        self.swagger_types = {
            'seeds': int
        }

        self.attribute_map = {
            'seeds': 'seeds'
        }

        self._seeds = seeds

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse200':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200 of this InlineResponse200.  # noqa: E501
        :rtype: InlineResponse200
        """
        return util.deserialize_model(dikt, cls)

    @property
    def seeds(self) -> int:
        """Gets the seeds of this InlineResponse200.


        :return: The seeds of this InlineResponse200.
        :rtype: int
        """
        return self._seeds

    @seeds.setter
    def seeds(self, seeds: int):
        """Sets the seeds of this InlineResponse200.


        :param seeds: The seeds of this InlineResponse200.
        :type seeds: int
        """

        self._seeds = seeds
