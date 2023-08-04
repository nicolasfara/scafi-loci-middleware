const publishCmd = `
echo "Publish command here"
`;

const config = require('semantic-release-preconfigured-conventional-commits');
config.branches = ["main"]
config.plugins.push(
    [
        "@semantic-release/exec",
        {
            "publishCmd": publishCmd,
        }
    ],
    "@semantic-release/github",
    "@semantic-release/git",
)
module.exports = config