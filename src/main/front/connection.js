/**
* Nav skaidrs, ka isti fronts izveido savienojumu ar back-end? cik saprotu config faila (web.xml vai jersey configuration class)
* izveido servlet container un registre nepiecishamos dependency vai klases... tad angular norada $http uz ka bazets attiecigais
* Rest points. Cik saprotu fornts ir tikai, lai attelotu informaciju, ko padod jersey rest pointi vai ari lai  savaktu
* nepiecieshamo informaciju no klienta ko nodot jersey restpiontam talaikai apstradasanai.
*
*/

var app = angular
    .module('myModule',[])
    .controller('myController', function($scope, $http){
        $http.get('http://localhost:8080/rest/fileservice/array').then(function (response) {
            $scope.array = response.data;
        });
    });