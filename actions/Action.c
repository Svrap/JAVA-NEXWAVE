Action()
{

	web_set_sockets_option("SSL_VERSION", "TLS1.2");

	web_add_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_auto_header("Sec-Fetch-Site", 
		"none");

	web_add_header("Sec-Fetch-User", 
		"?1");

	web_add_header("Upgrade-Insecure-Requests", 
		"1");

	web_url("demo.opencart.com", 
		"URL=https://demo.opencart.com/", 
		"Resource=0", 
		"RecContentType=text/html", 
		"Referer=", 
		"Snapshot=t1.inf", 
		"Mode=HTML", 
		LAST);

	web_add_auto_header("Sec-Fetch-Mode", 
		"no-cors");

	web_url("merchants.json", 
		"URL=https://www.gstatic.com/autofill/weekly/merchants.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t2.inf", 
		"Mode=HTML", 
		LAST);

	web_url("bins.json", 
		"URL=https://www.gstatic.com/autofill/hourly/bins.json", 
		"Resource=0", 
		"RecContentType=application/json", 
		"Referer=", 
		"Snapshot=t3.inf", 
		"Mode=HTML", 
		LAST);

	web_add_header("A-IM", 
		"x-bm,gzip");

	web_url("seed", 
		"URL=https://clientservices.googleapis.com/chrome-variations/seed?osname=win&channel=stable&milestone=79", 
		"Resource=0", 
		"Referer=", 
		"Snapshot=t4.inf", 
		"Mode=HTML", 
		EXTRARES, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_ext_variation_0.pb", "Referer=", ENDITEM, 
		"Url=https://ssl.gstatic.com/safebrowsing/csd/client_model_v5_variation_0.pb", "Referer=", ENDITEM, 
		"Url=https://demo.opencart.com/catalog/view/javascript/font-awesome/fonts/fontawesome-webfont.woff2?v=4.7.0", "Referer=https://demo.opencart.com/catalog/view/javascript/font-awesome/css/font-awesome.min.css", ENDITEM, 
		"Url=https://fonts.gstatic.com/s/opensans/v17/mem5YaGs126MiZpBA-UN7rgOUuhp.woff2", "Referer=https://fonts.googleapis.com/css?family=Open+Sans:400,400i,300,700", ENDITEM, 
		"Url=https://fonts.gstatic.com/s/opensans/v17/mem8YaGs126MiZpBA-UFVZ0b.woff2", "Referer=https://fonts.googleapis.com/css?family=Open+Sans:400,400i,300,700", ENDITEM, 
		"Url=https://clients1.google.com/tbproxy/af/query?q=Chc2LjEuMTcxNS4xNDQyL2VuIChHR0xMKRMZ5YRr3Z-avlkjLWdns_4kFA==", "Referer=", ENDITEM, 
		LAST);

	return 0;
}
