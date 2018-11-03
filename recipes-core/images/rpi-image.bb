include recipes-core/images/rpi-test-image.bb

DESCRIPTION = "Image for Raspberry Pi platform"

IMAGE_FEATURES += " \
    package-management \
    ssh-server-openssh \
    empty-root-password \
"

NETWORK = " \
    iw \
    tcpdump \
    bind-utils \
"

DEV_TOOLS = " \
    python3 \
    python3-pip \
    userland \
    strace \
"

EXTRA_TOOLS = " \
    htop \
    lsof \
    lshw \
    ncurses \
    git \
    tree \
    ntp \
    systemd-analyze \
    cpufrequtils \
"

PI_STUFF = " \
    raspi2fb \
"

IMAGE_INSTALL += " \
    ${NETWORK} \
    ${DEV_TOOLS} \
    ${EXTRA_TOOLS} \
    ${PI_STUFF} \
"
