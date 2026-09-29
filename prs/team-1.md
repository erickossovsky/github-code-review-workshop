**JIRA:** CPC-1988
## Context:
The billing page needs a small report for one customer: the total owed, the average bill, and the overdue bills.
## Does this PR change the .vscode folder in petclinic-frontend?:
No
## Changes
- Added `averageBill()` to `BillReport.java`: the average amount of a customer's bills.
- Added `overdueBills()`: the bills that are past their due day and still unpaid.
- Added `summary()` that prints the three numbers on one line.
- Extended `main` to print the results next to the expected values.
## Does this use the v2 API?:
No.
## Does this add a new communication between services?:
No
## Before and After UI (Required for UI-impacting PRs)
Not applicable. This PR does not change the UI.
## Dev notes (Optional)
Ran `BillReport` and looked at the printed summary.
## Linked pull requests (Optional)
None
