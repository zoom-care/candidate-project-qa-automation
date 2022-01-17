# Your working directory
$workingPath = "$PSScriptRoot\selenium"

# Add the working directory to the environment path.
# This is required for the ChromeDriver to work.
if (($env:Path -split ';') -notcontains $workingPath) {
    $env:Path += ";$workingPath"
}