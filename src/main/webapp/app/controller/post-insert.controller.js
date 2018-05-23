"use strict"

angular.module("app")
    .controller("postinsertController", ["$scope", "$stateParams", "Posts",
        function ($scope, $stateParams, Posts) {

            $scope.insertNew = function(){
                Posts.insert($http.post({
                    'titolo': $scope.titolo,
                    'descrizione': $scope.descrizione,
                    'dataAsString': $scope.data,
                    'visibile': $scope.visibile

                })).then(function(resp){
                    $state.go('common.insertpost')
                    console.log("dati inseriti")
                }).catch(function(err){
                    console.log("dati non inseriti")
                    console.log(err);
                });
            }


            init();
        }]);