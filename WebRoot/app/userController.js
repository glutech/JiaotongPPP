/**
 * @author Gehao Lu
 */

var app = angular.module('jiaotong-ppp',['ngTouch','ui.grid']);

app.controller('MainCtrl', ['userService', '$scope', function (userService, $scope) {

    userService.readAll().then(function (response) {
        $scope.users = response;
    });
    
    $scope.gridOptions = {
  		  columnDefs: [
  		    		    { name: 'id', displayName: 'ID', field:'userId' },
  		    		    { name: '用户', visible: 'true', field:'userName' },
  		    		    { name: '密码', visible: 'true' , field:'userPwd'},
  		    		    { name: '类型', visible: 'true',field:'userType' },
  		    		    { name: '电邮', visible: 'true',field:'userEmail' },
  		    		    { name: '电话', visible: 'true',field:'userContact'},
  		    		    { name: '地址', visible: 'true',field:'userAddress'},
  		    		    { name: '单位', visible: 'true', field:'userBelong'}
  		    		 ],
  		    data: 'users'
    };
    
    $scope.pagination = {
    	    pageSize: 5,
    	    pageNumber: 1,
    	    totalItems: null,
    	    getTotalPages: function () {
    	        return Math.ceil(this.totalItems / this.pageSize);
    	    },
    	    nextPage: function () {
    	        if (this.pageNumber < this.getTotalPages()) {
    	            this.pageNumber++;
    	            $scope.load();
    	        }
    	    },
    	    previousPage: function () {
    	        if (this.pageNumber > 1) {
    	            this.pageNumber--;
    	            $scope.load();
    	        }
    	    }
    	}
}]);