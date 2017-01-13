/**
 * 
 */

angular.module('projectList').
component('projectList', {
	templateUrl:'',
	controller: ['projectService', '$scope', function projectController($scope) {
		projectService.readAll().then(function (response) {
	        $scope.projects = response;
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
		  		    data: 'projects'
		};
	}
  ]
});