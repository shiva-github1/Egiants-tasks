var uploadController = function($scope, fileReader, apiService) {
	console.log(fileReader)
	console.log(apiService)
	$scope.getFile = function() {
		$scope.progress = 0;
		fileReader.readAsText($scope.file, $scope).then(function(result) {
			apiService.uploadJson(result).then(function(result) {
				$scope.fileContent = result;
			});
		});
	};

	$scope.$on("fileProgress", function(e, progress) {
		$scope.progress = progress.loaded / progress.total;
	});
};
upload.directive("ngFileSelect", function() {
	return {
		link : function($scope, el) {
			el.bind("change", function(e) {
				$scope.file = (e.srcElement || e.target).files[0];
				$scope.getFile();
			})
		}
	}
})
