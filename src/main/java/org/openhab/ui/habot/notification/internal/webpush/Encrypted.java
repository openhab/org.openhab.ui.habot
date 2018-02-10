package org.openhab.ui.habot.notification.internal.webpush;

import java.security.PublicKey;

public class Encrypted {
    private final PublicKey publicKey;
    private final byte[] salt;
    private final byte[] ciphertext;

    public Encrypted(final PublicKey publicKey, final byte[] salt, final byte[] ciphertext) {
        this.publicKey = publicKey;
        this.salt = salt;
        this.ciphertext = ciphertext;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public byte[] getSalt() {
        return salt;
    }

    public byte[] getCiphertext() {
        return ciphertext;
    }

    public static class Builder {
        private PublicKey publicKey;
        private byte[] salt;
        private byte[] ciphertext;

        public Builder withPublicKey(PublicKey publicKey) {
            this.publicKey = publicKey;

            return this;
        }

        public Builder withSalt(byte[] salt) {
            this.salt = salt;

            return this;
        }

        public Builder withCiphertext(byte[] ciphertext) {
            this.ciphertext = ciphertext;

            return this;
        }

        public Encrypted build() {
            return new Encrypted(publicKey, salt, ciphertext);
        }
    }
}
