# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from swagger_server.models.inline_response2002 import InlineResponse2002  # noqa: E501
from swagger_server.test import BaseTestCase


class TestPlantController(BaseTestCase):
    """PlantController integration test stubs"""

    def test_get_season_of_plant(self):
        """Test case for get_season_of_plant

        Find the season the plant grows in
        """
        response = self.client.open(
            '/mdd-team4/Garden/1.0.0/plant/season/{plant_type}'.format(plant_type=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_time_to_grow_of_plant(self):
        """Test case for get_time_to_grow_of_plant

        Get the time (in days) the plant needs to grow
        """
        response = self.client.open(
            '/mdd-team4/Garden/1.0.0/plant/timetogrow/{plant_type}'.format(plant_type=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
