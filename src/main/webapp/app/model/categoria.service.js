"use strict"

angular.module("app")
    .factory("Categorie", ["$http", function ($http) {


        return {
            get: function () {
                return $http.get('http://localhost:8080/blog/rest/categoria');
            },
            getByID: function (id) {
                return $http.get('http://localhost:8080/blog/rest/categoria/' + id);
            },
            insert: function () {
                return $http.insert('http://localhost:8080/blog/rest/categoria');
            }
        };

    }]);