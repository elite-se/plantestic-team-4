# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.inline_response200 import InlineResponse200  # noqa: E501
from swagger_server.models.plant import Plant  # noqa: E501
from swagger_server.test import BaseTestCase


class TestGardenController(BaseTestCase):
    """GardenController integration test stubs"""

    def test_add_plant(self):
        """Test case for add_plant

        Add a new plant to the Garden
        """
        response = self.client.open(
            '/mdd-team4/Garden/1.0.0/garden/plant/{plant_type}'.format(plant_type=56),
            method='POST',
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_seeds(self):
        """Test case for get_seeds

        Returns the number of seeded Plants
        """
        response = self.client.open(
            '/mdd-team4/Garden/1.0.0/garden/seeds',
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
