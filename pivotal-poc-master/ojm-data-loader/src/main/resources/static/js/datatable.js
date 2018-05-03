$(document).ready( function () {
	 var table = $('#fileSubmissionRecordsTable').DataTable({
			"sAjaxSource": "/fileSubmissionRecords",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "id"},
		      	{ "mData": "fileName" },
				{ "mData": "fileType" },
				{ "mData": "submittedOn" }
			]
	 })
});