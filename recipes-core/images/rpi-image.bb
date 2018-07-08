include recipes-core/images/rpi-test-image.bb

DESCRIPTION = "Image for Raspberry Pi"

# editor
IMAGE_INSTALL += "nano vim vim-vimrc vim-syntax"
# debug tools
IMAGE_INSTALL += "strace ldd tcpdump curl htop procps fio util-linux qemuwrapper-cross"
IMAGE_INSTALL += "wget tree file stress tar socat inotify-tools findutils"
# IMAGE_INSTALL += "cli device-finder periodic-backup usb-connect ncdu"

# filesystem encrypt utilities
# IMAGE_INSTALL += "fscryptctl keyutils fs-encryption-demo"
