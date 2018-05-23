"use strict"

angular.module("app")
    .controller("categoriaDetailsController", ["$scope", "$stateParams", "Categorie",
        function ($scope, $stateParams, Categorie) {

            $scope.categoria = {};

            //PAGE LOAD
            function init() {
                var id = $stateParams.id;

                Categorie.getByID(id).then(function (resp) {
                    $scope.categoria = resp.data;
                }).catch(function (err) {
                    console.log(err);
                });

            }


            init();
        }]);