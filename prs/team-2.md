**JIRA:** CPC-1987
## Context:
A bill that is already PAID could be paid again, so the owner was charged twice. It must not be payable a second time.
## Does this PR change the .vscode folder in petclinic-frontend?:
No
## Changes
- `canPay()` now blocks bills that are already PAID.
- `pay()` sets the status to PAID and sends the confirmation email **once, only after a successful payment**.
- Added a unit test, `BillPaymentTest`, that pays the same bill twice and expects the second one to be rejected.
## Does this use the v2 API?:
No.
## Does this add a new communication between services?:
No
## Before and After UI (Required for UI-impacting PRs)
Not applicable. This PR does not change the UI.
## Dev notes (Optional)
All tests pass: `BUILD SUCCESSFUL`.
The confirmation email is only sent when the payment goes through.
## Linked pull requests (Optional)
None
