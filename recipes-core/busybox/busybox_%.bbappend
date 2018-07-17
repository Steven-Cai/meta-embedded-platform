# look for files in the layer first
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://udhcpd.conf \
            file://enable-ftpput.cfg \
            file://enable-fractional-arguments.cfg\
            file://enable-ar.cfg \
            file://enable-timeout.cfg \
            file://enable-arp.cfg \
            file://enable-netstat-additional-options.cfg \
            file://enable-dos2unix.cfg \
            file://enable-misc.cfg \
           "

do_install_append() {
    install -d ${D}${sysconfdir}/

    install -m 0755 ${WORKDIR}/udhcpd.conf ${D}${sysconfdir}/
}

