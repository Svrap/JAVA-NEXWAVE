login()
{

	web_add_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_header("Sec-Fetch-Site", 
		"same-origin");

	web_add_header("Sec-Fetch-User", 
		"?1");

	web_add_header("Upgrade-Insecure-Requests", 
		"1");

	lr_think_time(32);

	web_url("index.php", 
		"URL=https://demo.opencart.com/index.php?route=account/login", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/", 
		"Snapshot=t5.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://clients1.google.com/tbproxy/af/query?q=Chc2LjEuMTcxNS4xNDQyL2VuIChHR0xMKRMZ5YRr3Z-avlkjLWdns_4kFBMZVyoHDriExaAjLXhvEhkkIy3OQUx6JBQ=", "Referer=", ENDITEM, 
		"Url=https://safebrowsing.googleapis.com/v4/threatListUpdates_fetch?$req="
		"Ch0KDGdvb2dsZWNocm9tZRINNzkuMC4zOTQ1LjExNxopCAUQARobCg0IBRAGGAEiAzAwMTABEP7wBxoCGATtySzaIgQgASACKAEaKQgBEAEaGwoNCAEQBhgBIgMwMDEwARCn9gYaAhgEKuBM6SIEIAEgAigBGikIAxABGhsKDQgDEAYYASIDMDAxMAEQrfUGGgIYBBMh6H0iBCABIAIoARopCAcQARobCg0IBxAGGAEiAzAwMTABEM3bBhoCGATk-G2EIgQgASACKAEaJwgBEAEaGQoNCAEQBhgBIgMwMDEwAxAUGgIYBBesTLYiBCABIAIoAxooCAEQCBoaCg0IARAIGAEiAzAwMTAEEIwZGgIYBM6wKXkiBCABIAIoBBonCAkQARoZCg0ICRAGGAEiAzAwMTAGEAIaAhgErxLB4SIEIAEgAigGGigIDxABGhoKDQgPEAYYASIDMDAxMAEQ_B4aAhgE2MHi8yIEIAEgAigBGicIChAIGh"
		"kKDQgKEAgYASIDMDAxMAEQBRoCGASNcPULIgQgASACKAEaJwgJEAEaGQoNCAkQBhgBIgMwMDEwARAYGgIYBDzf938iBCABIAIoARooCAgQARoaCg0ICBAGGAEiAzAwMTABEN8HGgIYBBpQvdIiBCABIAIoARooCA0QARoaCg0IDRAGGAEiAzAwMTABEIBjGgIYBISbf68iBCABIAIoARopCA4QARobCg0IDhAGGAEiAzAwMTABEL33AhoCGAQEtwLxIgQgASACKAEaKAgQEAEaGgoNCBAQBhgBIgMwMDEwARCXARoCGAQ8HFrFIgQgASACKAEiAggB&$ct=application/x-protobuf&key=AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw", "Referer=", ENDITEM, 
		LAST);

	return 0;
}
