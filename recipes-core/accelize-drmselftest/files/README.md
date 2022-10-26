## Commands to load fpga part of Accelize DrmSelfTest Application ##
sudo xmutil unloadapp
sudo xmutil loadapp accelize-drmselftest-firmware

## Example usage of Accelize DrmSelfTest Application ##

# To test the nodelocked licensing
1- Plug in the Internet network RJ-45 cable on the Kria board to donwload the permanent nodelocked license.
xlz-drmselftest 0
2- You can now unplugged the Internet cable and verify that the application continue to run successful

# To test the floating licensing
Make sure to plug in the Internet network RJ-45 cable on the Kria board.
xlz-drmselftest 1
If you unplugged the Internet cable you'll get an error.
