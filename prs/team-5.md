**JIRA:** CPC-1973
## Context:
Sign-up must reject weak passwords. A password is strong if it has at least 8 characters and at least one digit.
## Does this PR change the .vscode folder in petclinic-frontend?:
No
## Changes
- Added `isStrongPassword()`.
- Added `signUp()`: strong password creates the account, weak password is rejected.
- Added `notifyAuthService()` so the auth team is told about weak attempts.
## Does this use the v2 API?:
No.
## Does this add a new communication between services?:
No. Everything stays inside this class.
## Before and After UI (Required for UI-impacting PRs)
Not applicable. This PR does not change the UI.
## Dev notes (Optional)
Nothing is logged: no passwords or personal data are printed anywhere.
Ran `PasswordCheck` for one strong and one weak password.
## Linked pull requests (Optional)
None
