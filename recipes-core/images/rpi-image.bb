include recipes-core/images/rpi-test-image.bb

DESCRIPTION = "Image for Raspberry Pi"

DEPENDS += "bcm2835-bootfiles"

CORE_OS = " \
    openssh openssh-keygen openssh-sftp-server \
    packagegroup-core-boot \
    tzdata \
"
# term-prompt

WIFI_SUPPORT = " \
    crda \
    iw \
    linux-firmware \
    wpa-supplicant \
"
# wireless-tools

DEV_SDK_INSTALL = " \
    binutils \
    binutils-symlinks \
    coreutils \
    cpp \
    cpp-symlinks \
    diffutils \
    file \
    g++ \
    g++-symlinks \
    gcc \
    gcc-symlinks \
    gdb \
    gdbserver \
    gettext \
    git \
    ldd \
    libstdc++ \
    libstdc++-dev \
    libtool \
    make \
    pkgconfig \
    python3-modules \
"

DEV_EXTRAS = " \
    ntp \
    ntp-tickadj \
"
# spiloop
# serialecho

EXTRA_TOOLS_INSTALL = " \
    bzip2 \
    devmem2 \
    dosfstools \
    ethtool \
    fbset \
    findutils \
    i2c-tools \
    iperf3 \
    iproute2 \
    iptables \
    less \
    netcat \
    procps \
    sysfsutils \
    tcpdump \
    unzip \
    util-linux \
    wget \
    zip \
"

RPI_STUFF = " \
    omxplayer \
    userland \
"
# raspi2fb

EDITOR = " \
    nano \
    vim \
    vim-vimrc \
    vim-syntax \
"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${DEV_SDK_INSTALL} \
    ${DEV_EXTRAS} \
    ${EXTRA_TOOLS_INSTALL} \
    ${RPI_STUFF} \
    ${WIFI_SUPPORT} \
    ${EDITOR} \
"

# debug tools
# IMAGE_INSTALL += "strace ldd tcpdump curl htop procps fio util-linux qemuwrapper-cross"
# IMAGE_INSTALL += "wget tree file stress tar socat inotify-tools findutils"
# IMAGE_INSTALL += "cli device-finder periodic-backup usb-connect ncdu"

# filesystem encrypt utilities
# IMAGE_INSTALL += "fscryptctl keyutils fs-encryption-demo"
