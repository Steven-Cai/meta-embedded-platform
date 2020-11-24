SUMMARY = "Systemd configuration"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://eth.network \
           file://en.network \
           file://wlan.network \
          "

S = "${WORKDIR}"

inherit systemd

do_install() {
    install -d ${D}${sysconfdir}/systemd
    install -d ${D}${sysconfdir}/systemd/network
    install -m 644 ${S}/eth.network  ${D}${sysconfdir}/systemd/network/
    install -m 644 ${S}/en.network   ${D}${sysconfdir}/systemd/network/
    install -m 644 ${S}/wlan.network ${D}${sysconfdir}/systemd/network/
}

FILES_${PN} = "${sysconfdir}/systemd/network/* \
              "
