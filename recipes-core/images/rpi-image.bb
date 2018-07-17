include recipes-core/images/rpi-test-image.bb

DESCRIPTION = "Image for Raspberry Pi platform"

IMAGE_FEATURES += " \
    ssh-server-openssh \
"

IMAGE_INSTALL += " htop strace"
