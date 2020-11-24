FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://wpa_supplicant-nl80211-wlan0.conf \
	    file://wpa_supplicant.service "

SYSTEMD_AUTO_ENABLE = "enable"

SYSTEMD_SERVICE_${PN} = " wpa_supplicant.service  "
# SYSTEMD_SERVICE_${PN}_append = " wpa_supplicant-nl80211@wlan0.service  "

do_install_append () {
	install -d ${D}${sysconfdir}/wpa_supplicant/
	install -D -m 600 ${WORKDIR}/wpa_supplicant-nl80211-wlan0.conf ${D}${sysconfdir}/wpa_supplicant/

	install -d ${D}${systemd_unitdir}/system/
	rm -f ${D}/${systemd_unitdir}/system/wpa_supplicant*
	install -m 644 ${WORKDIR}/wpa_supplicant.service ${D}/${systemd_unitdir}/system/wpa_supplicant.service

	install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants/
	rm -f ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant*
	ln -s ${systemd_unitdir}/system/wpa_supplicant.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant.service
}
