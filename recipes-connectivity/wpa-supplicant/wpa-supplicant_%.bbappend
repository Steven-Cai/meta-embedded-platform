FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://wpa_supplicant.service \
	    file://wpa_supplicant.conf \
	   "

do_install_append() {
	install -d ${D}/${systemd_unitdir}/system
	install -m 644 ${WORKDIR}/*.service ${D}/${systemd_unitdir}/system

	install -d ${D}${sysconfdir}
	install -m 600 ${WORKDIR}/wpa_supplicant.conf ${D}${sysconfdir}/wpa_supplicant.conf
}
