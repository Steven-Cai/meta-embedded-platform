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

MEDIA = " \
    vc-graphics-hardfp \
    alsa-utils \
    omxplayer \
"
DEV_TOOLS = " \
    python3 \
    python3-pip \
    openjre-8 \
    openjdk-8 \
    nodejs \
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
    strace \
    screen \
"

PI_STUFF = " \
    rpi-gpio \
"

IMAGE_INSTALL += " \
    ${NETWORK} \
    ${MEDIA} \
    ${DEV_TOOLS} \
    ${EXTRA_TOOLS} \
    ${PI_STUFF} \
"
