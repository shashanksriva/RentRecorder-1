<!DOCTYPE html>
<html lang="en">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<body>

	<div ng-app="myApp" ng-controller="formCtrl">
		<form novalidate>
			Full Name:<br> <input type="text" ng-model="user.fullname"><br>
			User Name:<br> <input type="text" ng-model="user.username"><br>
			User Phone:<br> <input type="text" ng-model="user.userphone">
			<br>
			<br>
			<button ng-click="saveUser()">LOGIN</button>
		</form>
		<p>form = {{user}}</p>
	</div>

	<script>
var app = angular.module('myApp', []);
app.controller('formCtrl', function($scope) {
    $scope.master = {fullname:"Mayuri Srivastava", username:"mayurishashank", userphone:"9903477280"};
    $scope.saveUser = function() {
    	alert("Saved");
    };
});
</script>

</body>
</html>
