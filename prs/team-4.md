**JIRA:** CPC-1953
## Context:
The customer portal should greet the owner by name and show a short summary of their pets.
## Does this PR change the .vscode folder in petclinic-frontend?:
No
## Changes
- Added `welcomeMessage()`: "Welcome back, <name>!".
- Added `petSummary()`: handles no pets, one pet, and several pets ("Rex, Luna and Milo").
- Added `badge()`: owners with more than 3 pets get a "Pet lover" badge.
- Extended `main` to print all of them.
## Does this use the v2 API?:
No.
## Does this add a new communication between services?:
No
## Before and After UI (Required for UI-impacting PRs)
Not applicable. This PR does not change the UI.
## Dev notes (Optional)
Ran `OwnerWelcome`; the three pet cases print as expected.
## Linked pull requests (Optional)
None
