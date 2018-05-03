$(document).ready( function () {
	 var table = $('#orderExportsTable').DataTable({
			"sAjaxSource": "/api/orderExports",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "salesOrderNum"},
		      	{ "mData": "type" },
				{ "mData": "account" },
				{ "mData": "endUser" },
				{ "mData": "billingAccount" },
				{ "mData": "contract" }
			]
	 })
});