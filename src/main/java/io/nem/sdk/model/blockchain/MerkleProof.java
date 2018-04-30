/*
 * Copyright 2018 NEM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.nem.sdk.model.blockchain;

import java.math.BigInteger;
import java.util.List;

public class MerkleProof {
    private final String transactionHash;
    private final BigInteger blockHeight;
    private final String merkleRootHash;
    private final List<String> hashes;
    private final boolean valid;

    public MerkleProof(String transactionHash, BigInteger blockHeight, String merkleRootHash, List<String> hashes) {
        this.transactionHash = transactionHash;
        this.blockHeight = blockHeight;
        this.merkleRootHash = merkleRootHash;
        this.hashes = hashes;
        this.valid = auditMerkleProof(transactionHash, merkleRootHash, hashes);
    }

    // TODO: implement method
    private boolean auditMerkleProof(String transactionHash, String merkleRootHash, List<String> hashes) { return true; }

    public String getTransactionHash() { return transactionHash; }

    public BigInteger getBlockHeight() { return blockHeight; }

    public String getMerkleRootHash() { return merkleRootHash; }

    public List<String> getHashes() { return hashes; }

    public boolean isValid() { return valid; }
}
