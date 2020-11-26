SUMMARY = "hardware test"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://canon.mp3 \
          "

s = "${WORKDIR}"

do_install() {
    install -d ${D}/platform
    install -d ${D}/platform/test
    install -d ${D}/platform/test/resource
    install -m 644 ${WORKDIR}/canon.mp3 ${D}/platform/test/resource
}

FILES_${PN} += "/platform/test/resource"
