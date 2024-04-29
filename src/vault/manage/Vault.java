package vault.manage;

public class Vault {

        private VaultManager vaultManager;

        public void addVaultManager(VaultManager manager) {
            this.vaultManager = manager;
        }

        public void removeVaultManager() {
            this.vaultManager = null;
        }

        public boolean checkAccess(Person person) throws AccessDeniedException {
            if (vaultManager == null || !vaultManager.equals(person)) {
                throw new AccessDeniedException("This person does not have access to the vault.");
            }
            return true;
        }

        public void showVaultAdministrator() {
            if (vaultManager == null) {
                System.out.println("No vault manager is assigned.");
            } else {
                System.out.println("The vault manager is: " + vaultManager.getFirstName() + " " + vaultManager.getLastName());
            }
        }
    }


