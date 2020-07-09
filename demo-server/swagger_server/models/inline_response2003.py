# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class InlineResponse2003(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, stored: int=None):  # noqa: E501
        """InlineResponse2003 - a model defined in Swagger

        :param stored: The stored of this InlineResponse2003.  # noqa: E501
        :type stored: int
        """
        self.swagger_types = {
            'stored': int
        }

        self.attribute_map = {
            'stored': 'stored'
        }

        self._stored = stored

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse2003':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_3 of this InlineResponse2003.  # noqa: E501
        :rtype: InlineResponse2003
        """
        return util.deserialize_model(dikt, cls)

    @property
    def stored(self) -> int:
        """Gets the stored of this InlineResponse2003.


        :return: The stored of this InlineResponse2003.
        :rtype: int
        """
        return self._stored

    @stored.setter
    def stored(self, stored: int):
        """Sets the stored of this InlineResponse2003.


        :param stored: The stored of this InlineResponse2003.
        :type stored: int
        """

        self._stored = stored
