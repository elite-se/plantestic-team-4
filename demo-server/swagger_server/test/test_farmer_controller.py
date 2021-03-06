# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.inline_response2003 import InlineResponse2003  # noqa: E501
from swagger_server.test import BaseTestCase


class TestFarmerController(BaseTestCase):
    """FarmerController integration test stubs"""

    def test_get_plant_storage(self):
        """Test case for get_plant_storage

        Returns the numer of Plants of plant_type that were reaped.
        """
        response = self.client.open(
            '/mdd-team4/Garden/1.0.0/farmer/storage/{plant_type}'.format(plant_type=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_plant_storage_by_id(self):
        """Test case for get_plant_storage_by_id

        Returns the numer of Plants of plant_type that were reaped.
        """
        response = self.client.open(
            '/mdd-team4/Garden/1.0.0/farmer/hasplant/{plantId}'.format(plantId=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_notify_farmer(self):
        """Test case for notify_farmer

        Tells the farmer a plant is ready to reap.
        """
        data = dict(plantID=789)
        response = self.client.open(
            '/mdd-team4/Garden/1.0.0/farmer/grown',
            method='POST',
            data=data,
            content_type='application/x-www-form-urlencoded')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
