# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from swagger_server.models.base_model_ import Model
from swagger_server import util


class InlineResponse2001Foo(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, bar: str=None):  # noqa: E501
        """InlineResponse2001Foo - a model defined in Swagger

        :param bar: The bar of this InlineResponse2001Foo.  # noqa: E501
        :type bar: str
        """
        self.swagger_types = {
            'bar': str
        }

        self.attribute_map = {
            'bar': 'bar'
        }

        self._bar = bar

    @classmethod
    def from_dict(cls, dikt) -> 'InlineResponse2001Foo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The inline_response_200_1_foo of this InlineResponse2001Foo.  # noqa: E501
        :rtype: InlineResponse2001Foo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bar(self) -> str:
        """Gets the bar of this InlineResponse2001Foo.


        :return: The bar of this InlineResponse2001Foo.
        :rtype: str
        """
        return self._bar

    @bar.setter
    def bar(self, bar: str):
        """Sets the bar of this InlineResponse2001Foo.


        :param bar: The bar of this InlineResponse2001Foo.
        :type bar: str
        """
        if bar is None:
            raise ValueError("Invalid value for `bar`, must not be `None`")  # noqa: E501

        self._bar = bar