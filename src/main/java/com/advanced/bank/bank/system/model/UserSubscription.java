package com.advanced.bank.bank.system.model;

import java.util.HashSet;
import java.util.Set;

public class UserSubscription {
    private Long id;
    private Set<Feature> features = new HashSet<>();
    private Set<FeaturePackage> featurePackages = new HashSet<>();
    private Account account;

    public Long getId() {
        return id;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }

    public Set<FeaturePackage> getFeaturePackages() {
        return featurePackages;
    }

    public void setFeaturePackages(Set<FeaturePackage> featurePackages) {
        this.featurePackages = featurePackages;
    }
}
