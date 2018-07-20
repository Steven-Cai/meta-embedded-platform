include recipes-core/images/rpi-test-image.bb

DESCRIPTION = "Image for Raspberry Pi platform"

IMAGE_FEATURES += " \
    ssh-server-openssh \
"

WIFI_SUPPORT = " \
    iw \
    linux-firmware \
    wpa-supplicant \
"

DEV_TOOLS = " \
    strace \
"

EXTRA_TOOLS = " \
    htop \
    lshw \
"

IMAGE_INSTALL += " \
    ${WIFI_SUPPORT} \
    ${DEV_TOOLS} \
    ${EXTRA_TOOLS} \
"
