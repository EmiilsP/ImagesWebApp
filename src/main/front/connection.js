var app = angular
    .module('myModule',[])
    .controller('myController', function($scope, $http){
        $http.get('rest/fileservice/array').then(function (response) {
            $scope.array = response.data;
        });
    });