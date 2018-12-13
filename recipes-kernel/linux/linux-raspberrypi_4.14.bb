LINUX_VERSION ?= "4.14.39"

SRCREV = "e44bf6535914751fb6e7d0dcd79c72a82bdf3cce"
SRC_URI = " \
    git://github.com/steven-cai/linux.git;branch=rpi-platform \
    "

require linux-raspberrypi.inc
