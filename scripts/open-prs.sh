#!/usr/bin/env bash
# Opens one prepared pull request per team branch, with the PetClinic (CPC) template already filled in.
# Run from the repo root after pushing main and the team-* branches. Needs the GitHub CLI (gh) logged in.
set -e
for n in 1 2 3 4 5 6 7 8; do
  gh pr create --base main --head "team-$n" --title "$(cat prs/team-$n.title)" --body-file "prs/team-$n.md"
done
