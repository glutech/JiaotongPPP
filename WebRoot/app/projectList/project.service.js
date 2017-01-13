/**
 * @author Gehao Lu
 */

(function () {
    angular.module('ui.grid')
      .service('projectService', ['$http', projectService]);
 
    function projectService($http) {
        var self = this;
        var baseUrl = 'http://localhost:8080/JiaotongPPP/';
        var objectName = 'Projects';
        self.readAll = function () {
            return $http({
                method: 'GET',
                url: baseUrl + objectName,
            }).then(function (response) {
                return response.data;
            });
        };
        self.readOne = function (id) {
            return $http({
                method: 'GET',
                url: baseUrl + objectName + '/' + id,
            }).then(function (response) {
                return response.data;
            });
        };
        self.create = function (data) {
            return $http({
                method: 'POST',
                url: baseUrl + objectName,
                data: data,
                params: {
                    returnObject: true
                },
            }).then(function (response) {
                return response.data;
            });
        };
        self.update = function (id, data) {
            return $http({
                method: 'PUT',
                url: baseUrl + objectName + '/' + id,
                data: data,
            }).then(function (response) {
                return response.data;
            });
        };
        self.delete = function (id) {
            return $http({
                method: 'DELETE',
                url: baseUrl + objectName + '/' + id,
            });
        };
    }
}());