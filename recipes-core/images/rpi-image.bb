include recipes-core/images/rpi-test-image.bb

DESCRIPTION = "Image for Raspberry Pi platform"

IMAGE_FEATURES += " \
    package-management \
    ssh-server-openssh \
    empty-root-password \
"

NETWORK = " \
    iw \
    iperf3 \
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
    procps \
    systemd-analyze \
    cpufrequtils \
    e2fsprogs-mke2fs \
    parted \
    whiptail \
"

PI_STUFF = " \
    raspi2fb \
"

JAVA = " \
    openjre-8 \
"

IMAGE_INSTALL += " \
    ${NETWORK} \
    ${DEV_TOOLS} \
    ${EXTRA_TOOLS} \
    ${JAVA} \
    ${PI_STUFF} \
"
