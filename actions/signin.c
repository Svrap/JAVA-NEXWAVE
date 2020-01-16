signin()
{

	web_add_header("Origin", 
		"https://demo.opencart.com");

	web_add_header("Sec-Fetch-Mode", 
		"navigate");

	web_add_header("Sec-Fetch-Site", 
		"same-origin");

	web_add_header("Sec-Fetch-User", 
		"?1");

	web_add_header("Upgrade-Insecure-Requests", 
		"1");

	web_submit_data("index.php_2", 
		"Action=https://demo.opencart.com/index.php?route=account/login", 
		"Method=POST", 
		"EncType=multipart/form-data", 
		"RecContentType=text/html", 
		"Referer=https://demo.opencart.com/index.php?route=account/login", 
		"Snapshot=t6.inf", 
		"Mode=HTML", 
		ITEMDATA, 
		"Name=email", "Value=rajaramakhilofficial@gmail.com", ENDITEM, 
		"Name=password", "Value=akhil000", ENDITEM, 
		LAST);

	return 0;
}
