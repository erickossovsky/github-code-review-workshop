**JIRA:** CPC-1996
## Context:
The inventory page shows how many products are low on stock. Low stock means **fewer than 5** items left.
## Does this PR change the .vscode folder in petclinic-frontend?:
No
## Changes
- Added `countLowStock()`: counts the products with fewer than 5 items.
- **Only `LowStock.java` is changed.**
## Does this use the v2 API?:
No.
## Does this add a new communication between services?:
No
## Before and After UI (Required for UI-impacting PRs)
Not applicable. This PR does not change the UI.
## Dev notes (Optional)
Ran `LowStock` on the sample products.
## Linked pull requests (Optional)
None
