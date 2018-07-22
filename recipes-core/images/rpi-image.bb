include recipes-core/images/rpi-test-image.bb

DESCRIPTION = "Image for Raspberry Pi platform"

IMAGE_FEATURES += " \
    ssh-server-openssh \
"

WIFI_SUPPORT = " \
    iw \
"

DEV_TOOLS = " \
    userland \
    strace \
"

EXTRA_TOOLS = " \
    htop \
    lshw \
    ncurses \
    git \
"

PI_STUFF = " \
    raspi2fb \
"

IMAGE_INSTALL += " \
    ${WIFI_SUPPORT} \
    ${DEV_TOOLS} \
    ${EXTRA_TOOLS} \
    ${PI_STUFF} \
"
