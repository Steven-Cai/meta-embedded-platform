## WIFI

    # wpa_supplicant -B -i interface -c /etc/wpa_supplicant/wpa_supplicant.conf
    # wpa_cli
	> add_network
    0
    > set_network 0 ssid "MYSSID"
    > set_network 0 psk "passphrase"
    > enable_network 0
    <2>CTRL-EVENT-CONNECTED - Connection to 00:00:00:00:00:00 completed (reauth) [id=0 id_str=]
    > save_config
    OK

## BlueTooth

## Camera

### Reference
<https://wiki.archlinux.org/index.php/WPA_supplicant>
