**JIRA:** CPC-1954
## Context:
The visits page showed past appointments as UPCOMING. Visits before today must be PAST. Visits today or later are UPCOMING. The page also shows the next upcoming visit.
## Does this PR change the .vscode folder in petclinic-frontend?:
No
## Changes
- Added `visitStatus(visitDay, today)`.
- Added `nextVisit()`: returns the earliest upcoming visit.
- `main` prints every visit with its status and the next visit.
## Does this use the v2 API?:
No.
## Does this add a new communication between services?:
No
## Before and After UI (Required for UI-impacting PRs)
Not applicable. This PR does not change the UI.
## Dev notes (Optional)
Ran `VisitStatus` with today = 10.
## Linked pull requests (Optional)
None
