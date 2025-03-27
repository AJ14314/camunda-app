package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibsInPluginsBlock extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ComLibraryAccessors laccForComLibraryAccessors = new ComLibraryAccessors(owner);
    private final OrgLibraryAccessors laccForOrgLibraryAccessors = new OrgLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibsInPluginsBlock(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Group of libraries at <b>com</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ComLibraryAccessors getCom() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForComLibraryAccessors;
    }

    /**
     * Group of libraries at <b>org</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public OrgLibraryAccessors getOrg() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForOrgLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BundleAccessors getBundles() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComLibraryAccessors extends SubDependencyFactory {
        private final ComH2databaseLibraryAccessors laccForComH2databaseLibraryAccessors = new ComH2databaseLibraryAccessors(owner);

        public ComLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>com.h2database</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ComH2databaseLibraryAccessors getH2database() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForComH2databaseLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ComH2databaseLibraryAccessors extends SubDependencyFactory {

        public ComH2databaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>h2</b> with <b>com.h2database:h2</b> coordinates and
         * with version reference <b>com.h2database.h2</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getH2() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("com.h2database.h2");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaLibraryAccessors laccForOrgCamundaLibraryAccessors = new OrgCamundaLibraryAccessors(owner);
        private final OrgOpenjdkLibraryAccessors laccForOrgOpenjdkLibraryAccessors = new OrgOpenjdkLibraryAccessors(owner);
        private final OrgSpringframeworkLibraryAccessors laccForOrgSpringframeworkLibraryAccessors = new OrgSpringframeworkLibraryAccessors(owner);

        public OrgLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaLibraryAccessors getCamunda() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.openjdk</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgOpenjdkLibraryAccessors getOpenjdk() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgOpenjdkLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.springframework</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkLibraryAccessors getSpringframework() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaBpmLibraryAccessors laccForOrgCamundaBpmLibraryAccessors = new OrgCamundaBpmLibraryAccessors(owner);
        private final OrgCamundaConnectLibraryAccessors laccForOrgCamundaConnectLibraryAccessors = new OrgCamundaConnectLibraryAccessors(owner);
        private final OrgCamundaSpinLibraryAccessors laccForOrgCamundaSpinLibraryAccessors = new OrgCamundaSpinLibraryAccessors(owner);

        public OrgCamundaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.bpm</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaBpmLibraryAccessors getBpm() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaBpmLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.camunda.connect</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaConnectLibraryAccessors getConnect() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaConnectLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.camunda.spin</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaSpinLibraryAccessors getSpin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaSpinLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaBpmLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaBpmCamundaLibraryAccessors laccForOrgCamundaBpmCamundaLibraryAccessors = new OrgCamundaBpmCamundaLibraryAccessors(owner);
        private final OrgCamundaBpmSpringbootLibraryAccessors laccForOrgCamundaBpmSpringbootLibraryAccessors = new OrgCamundaBpmSpringbootLibraryAccessors(owner);

        public OrgCamundaBpmLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.bpm.camunda</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaBpmCamundaLibraryAccessors getCamunda() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaBpmCamundaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.camunda.bpm.springboot</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaBpmSpringbootLibraryAccessors getSpringboot() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaBpmSpringbootLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaBpmCamundaLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaBpmCamundaEngineLibraryAccessors laccForOrgCamundaBpmCamundaEngineLibraryAccessors = new OrgCamundaBpmCamundaEngineLibraryAccessors(owner);

        public OrgCamundaBpmCamundaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.bpm.camunda.engine</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaBpmCamundaEngineLibraryAccessors getEngine() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaBpmCamundaEngineLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaBpmCamundaEngineLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaBpmCamundaEnginePluginLibraryAccessors laccForOrgCamundaBpmCamundaEnginePluginLibraryAccessors = new OrgCamundaBpmCamundaEnginePluginLibraryAccessors(owner);

        public OrgCamundaBpmCamundaEngineLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.bpm.camunda.engine.plugin</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaBpmCamundaEnginePluginLibraryAccessors getPlugin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaBpmCamundaEnginePluginLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaBpmCamundaEnginePluginLibraryAccessors extends SubDependencyFactory {

        public OrgCamundaBpmCamundaEnginePluginLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>connect</b> with <b>org.camunda.bpm:camunda-engine-plugin-connect</b> coordinates and
         * with version reference <b>org.camunda.bpm.camunda.engine.plugin.connect</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getConnect() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.camunda.bpm.camunda.engine.plugin.connect");
        }

        /**
         * Dependency provider for <b>spin</b> with <b>org.camunda.bpm:camunda-engine-plugin-spin</b> coordinates and
         * with version reference <b>org.camunda.bpm.camunda.engine.plugin.spin</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getSpin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.camunda.bpm.camunda.engine.plugin.spin");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaBpmSpringbootLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaBpmSpringbootCamundaLibraryAccessors laccForOrgCamundaBpmSpringbootCamundaLibraryAccessors = new OrgCamundaBpmSpringbootCamundaLibraryAccessors(owner);

        public OrgCamundaBpmSpringbootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.bpm.springboot.camunda</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaBpmSpringbootCamundaLibraryAccessors getCamunda() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaBpmSpringbootCamundaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaBpmSpringbootCamundaLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaBpmSpringbootCamundaBpmLibraryAccessors laccForOrgCamundaBpmSpringbootCamundaBpmLibraryAccessors = new OrgCamundaBpmSpringbootCamundaBpmLibraryAccessors(owner);

        public OrgCamundaBpmSpringbootCamundaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.bpm.springboot.camunda.bpm</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaBpmSpringbootCamundaBpmLibraryAccessors getBpm() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaBpmSpringbootCamundaBpmLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaBpmSpringbootCamundaBpmLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaBpmSpringbootCamundaBpmSpringLibraryAccessors laccForOrgCamundaBpmSpringbootCamundaBpmSpringLibraryAccessors = new OrgCamundaBpmSpringbootCamundaBpmSpringLibraryAccessors(owner);

        public OrgCamundaBpmSpringbootCamundaBpmLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.bpm.springboot.camunda.bpm.spring</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaBpmSpringbootCamundaBpmSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaBpmSpringbootCamundaBpmSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaBpmSpringbootCamundaBpmSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaBpmSpringbootCamundaBpmSpringBootLibraryAccessors laccForOrgCamundaBpmSpringbootCamundaBpmSpringBootLibraryAccessors = new OrgCamundaBpmSpringbootCamundaBpmSpringBootLibraryAccessors(owner);

        public OrgCamundaBpmSpringbootCamundaBpmSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.bpm.springboot.camunda.bpm.spring.boot</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaBpmSpringbootCamundaBpmSpringBootLibraryAccessors getBoot() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaBpmSpringbootCamundaBpmSpringBootLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaBpmSpringbootCamundaBpmSpringBootLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaBpmSpringbootCamundaBpmSpringBootStarterLibraryAccessors laccForOrgCamundaBpmSpringbootCamundaBpmSpringBootStarterLibraryAccessors = new OrgCamundaBpmSpringbootCamundaBpmSpringBootStarterLibraryAccessors(owner);

        public OrgCamundaBpmSpringbootCamundaBpmSpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.bpm.springboot.camunda.bpm.spring.boot.starter</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaBpmSpringbootCamundaBpmSpringBootStarterLibraryAccessors getStarter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaBpmSpringbootCamundaBpmSpringBootStarterLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaBpmSpringbootCamundaBpmSpringBootStarterLibraryAccessors extends SubDependencyFactory {

        public OrgCamundaBpmSpringbootCamundaBpmSpringBootStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>rest</b> with <b>org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-rest</b> coordinates and
         * with version reference <b>org.camunda.bpm.springboot.camunda.bpm.spring.boot.starter.rest</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getRest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.camunda.bpm.springboot.camunda.bpm.spring.boot.starter.rest");
        }

        /**
         * Dependency provider for <b>webapp</b> with <b>org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-webapp</b> coordinates and
         * with version reference <b>org.camunda.bpm.springboot.camunda.bpm.spring.boot.starter.webapp</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getWebapp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.camunda.bpm.springboot.camunda.bpm.spring.boot.starter.webapp");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaConnectLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaConnectCamundaLibraryAccessors laccForOrgCamundaConnectCamundaLibraryAccessors = new OrgCamundaConnectCamundaLibraryAccessors(owner);

        public OrgCamundaConnectLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.connect.camunda</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaConnectCamundaLibraryAccessors getCamunda() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaConnectCamundaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaConnectCamundaLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaConnectCamundaConnectLibraryAccessors laccForOrgCamundaConnectCamundaConnectLibraryAccessors = new OrgCamundaConnectCamundaConnectLibraryAccessors(owner);

        public OrgCamundaConnectCamundaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.connect.camunda.connect</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaConnectCamundaConnectLibraryAccessors getConnect() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaConnectCamundaConnectLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaConnectCamundaConnectLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaConnectCamundaConnectHttpLibraryAccessors laccForOrgCamundaConnectCamundaConnectHttpLibraryAccessors = new OrgCamundaConnectCamundaConnectHttpLibraryAccessors(owner);

        public OrgCamundaConnectCamundaConnectLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.connect.camunda.connect.http</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaConnectCamundaConnectHttpLibraryAccessors getHttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaConnectCamundaConnectHttpLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaConnectCamundaConnectHttpLibraryAccessors extends SubDependencyFactory {

        public OrgCamundaConnectCamundaConnectHttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>client</b> with <b>org.camunda.connect:camunda-connect-http-client</b> coordinates and
         * with version reference <b>org.camunda.connect.camunda.connect.http.client</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getClient() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.camunda.connect.camunda.connect.http.client");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaSpinLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaSpinCamundaLibraryAccessors laccForOrgCamundaSpinCamundaLibraryAccessors = new OrgCamundaSpinCamundaLibraryAccessors(owner);

        public OrgCamundaSpinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.spin.camunda</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaSpinCamundaLibraryAccessors getCamunda() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaSpinCamundaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaSpinCamundaLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaSpinCamundaSpinLibraryAccessors laccForOrgCamundaSpinCamundaSpinLibraryAccessors = new OrgCamundaSpinCamundaSpinLibraryAccessors(owner);

        public OrgCamundaSpinCamundaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.spin.camunda.spin</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaSpinCamundaSpinLibraryAccessors getSpin() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaSpinCamundaSpinLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaSpinCamundaSpinLibraryAccessors extends SubDependencyFactory {
        private final OrgCamundaSpinCamundaSpinDataformatLibraryAccessors laccForOrgCamundaSpinCamundaSpinDataformatLibraryAccessors = new OrgCamundaSpinCamundaSpinDataformatLibraryAccessors(owner);

        public OrgCamundaSpinCamundaSpinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.camunda.spin.camunda.spin.dataformat</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCamundaSpinCamundaSpinDataformatLibraryAccessors getDataformat() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCamundaSpinCamundaSpinDataformatLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCamundaSpinCamundaSpinDataformatLibraryAccessors extends SubDependencyFactory {

        public OrgCamundaSpinCamundaSpinDataformatLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>all</b> with <b>org.camunda.spin:camunda-spin-dataformat-all</b> coordinates and
         * with version reference <b>org.camunda.spin.camunda.spin.dataformat.all</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAll() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.camunda.spin.camunda.spin.dataformat.all");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgOpenjdkLibraryAccessors extends SubDependencyFactory {
        private final OrgOpenjdkNashornLibraryAccessors laccForOrgOpenjdkNashornLibraryAccessors = new OrgOpenjdkNashornLibraryAccessors(owner);

        public OrgOpenjdkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.openjdk.nashorn</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgOpenjdkNashornLibraryAccessors getNashorn() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgOpenjdkNashornLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgOpenjdkNashornLibraryAccessors extends SubDependencyFactory {
        private final OrgOpenjdkNashornNashornLibraryAccessors laccForOrgOpenjdkNashornNashornLibraryAccessors = new OrgOpenjdkNashornNashornLibraryAccessors(owner);

        public OrgOpenjdkNashornLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.openjdk.nashorn.nashorn</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgOpenjdkNashornNashornLibraryAccessors getNashorn() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgOpenjdkNashornNashornLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgOpenjdkNashornNashornLibraryAccessors extends SubDependencyFactory {

        public OrgOpenjdkNashornNashornLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>core</b> with <b>org.openjdk.nashorn:nashorn-core</b> coordinates and
         * with version reference <b>org.openjdk.nashorn.nashorn.core</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCore() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.openjdk.nashorn.nashorn.core");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootLibraryAccessors laccForOrgSpringframeworkBootLibraryAccessors = new OrgSpringframeworkBootLibraryAccessors(owner);

        public OrgSpringframeworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.boot</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootLibraryAccessors getBoot() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringLibraryAccessors laccForOrgSpringframeworkBootSpringLibraryAccessors = new OrgSpringframeworkBootSpringLibraryAccessors(owner);

        public OrgSpringframeworkBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.boot.spring</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootSpringLibraryAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootSpringLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootSpringLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootLibraryAccessors laccForOrgSpringframeworkBootSpringBootLibraryAccessors = new OrgSpringframeworkBootSpringBootLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.boot.spring.boot</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootSpringBootLibraryAccessors getBoot() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootSpringBootLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootSpringBootLibraryAccessors extends SubDependencyFactory {
        private final OrgSpringframeworkBootSpringBootStarterLibraryAccessors laccForOrgSpringframeworkBootSpringBootStarterLibraryAccessors = new OrgSpringframeworkBootSpringBootStarterLibraryAccessors(owner);

        public OrgSpringframeworkBootSpringBootLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.springframework.boot.spring.boot.starter</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgSpringframeworkBootSpringBootStarterLibraryAccessors getStarter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgSpringframeworkBootSpringBootStarterLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgSpringframeworkBootSpringBootStarterLibraryAccessors extends SubDependencyFactory {

        public OrgSpringframeworkBootSpringBootStarterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jdbc</b> with <b>org.springframework.boot:spring-boot-starter-jdbc</b> coordinates and
         * with version reference <b>org.springframework.boot.spring.boot.starter.jdbc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJdbc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.jdbc");
        }

        /**
         * Dependency provider for <b>web</b> with <b>org.springframework.boot:spring-boot-starter-web</b> coordinates and
         * with version reference <b>org.springframework.boot.spring.boot.starter.web</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getWeb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.springframework.boot.spring.boot.starter.web");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final ComVersionAccessors vaccForComVersionAccessors = new ComVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com</b>
         */
        public ComVersionAccessors getCom() {
            return vaccForComVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org</b>
         */
        public OrgVersionAccessors getOrg() {
            return vaccForOrgVersionAccessors;
        }

    }

    public static class ComVersionAccessors extends VersionFactory  {

        private final ComH2databaseVersionAccessors vaccForComH2databaseVersionAccessors = new ComH2databaseVersionAccessors(providers, config);
        public ComVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.com.h2database</b>
         */
        public ComH2databaseVersionAccessors getH2database() {
            return vaccForComH2databaseVersionAccessors;
        }

    }

    public static class ComH2databaseVersionAccessors extends VersionFactory  {

        public ComH2databaseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>com.h2database.h2</b> with value <b>2.2.224</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getH2() { return getVersion("com.h2database.h2"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgCamundaVersionAccessors vaccForOrgCamundaVersionAccessors = new OrgCamundaVersionAccessors(providers, config);
        private final OrgOpenjdkVersionAccessors vaccForOrgOpenjdkVersionAccessors = new OrgOpenjdkVersionAccessors(providers, config);
        private final OrgSpringframeworkVersionAccessors vaccForOrgSpringframeworkVersionAccessors = new OrgSpringframeworkVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda</b>
         */
        public OrgCamundaVersionAccessors getCamunda() {
            return vaccForOrgCamundaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.openjdk</b>
         */
        public OrgOpenjdkVersionAccessors getOpenjdk() {
            return vaccForOrgOpenjdkVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.springframework</b>
         */
        public OrgSpringframeworkVersionAccessors getSpringframework() {
            return vaccForOrgSpringframeworkVersionAccessors;
        }

    }

    public static class OrgCamundaVersionAccessors extends VersionFactory  {

        private final OrgCamundaBpmVersionAccessors vaccForOrgCamundaBpmVersionAccessors = new OrgCamundaBpmVersionAccessors(providers, config);
        private final OrgCamundaConnectVersionAccessors vaccForOrgCamundaConnectVersionAccessors = new OrgCamundaConnectVersionAccessors(providers, config);
        private final OrgCamundaSpinVersionAccessors vaccForOrgCamundaSpinVersionAccessors = new OrgCamundaSpinVersionAccessors(providers, config);
        public OrgCamundaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.bpm</b>
         */
        public OrgCamundaBpmVersionAccessors getBpm() {
            return vaccForOrgCamundaBpmVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.camunda.connect</b>
         */
        public OrgCamundaConnectVersionAccessors getConnect() {
            return vaccForOrgCamundaConnectVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.camunda.spin</b>
         */
        public OrgCamundaSpinVersionAccessors getSpin() {
            return vaccForOrgCamundaSpinVersionAccessors;
        }

    }

    public static class OrgCamundaBpmVersionAccessors extends VersionFactory  {

        private final OrgCamundaBpmCamundaVersionAccessors vaccForOrgCamundaBpmCamundaVersionAccessors = new OrgCamundaBpmCamundaVersionAccessors(providers, config);
        private final OrgCamundaBpmSpringbootVersionAccessors vaccForOrgCamundaBpmSpringbootVersionAccessors = new OrgCamundaBpmSpringbootVersionAccessors(providers, config);
        public OrgCamundaBpmVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.bpm.camunda</b>
         */
        public OrgCamundaBpmCamundaVersionAccessors getCamunda() {
            return vaccForOrgCamundaBpmCamundaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.camunda.bpm.springboot</b>
         */
        public OrgCamundaBpmSpringbootVersionAccessors getSpringboot() {
            return vaccForOrgCamundaBpmSpringbootVersionAccessors;
        }

    }

    public static class OrgCamundaBpmCamundaVersionAccessors extends VersionFactory  {

        private final OrgCamundaBpmCamundaEngineVersionAccessors vaccForOrgCamundaBpmCamundaEngineVersionAccessors = new OrgCamundaBpmCamundaEngineVersionAccessors(providers, config);
        public OrgCamundaBpmCamundaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.bpm.camunda.engine</b>
         */
        public OrgCamundaBpmCamundaEngineVersionAccessors getEngine() {
            return vaccForOrgCamundaBpmCamundaEngineVersionAccessors;
        }

    }

    public static class OrgCamundaBpmCamundaEngineVersionAccessors extends VersionFactory  {

        private final OrgCamundaBpmCamundaEnginePluginVersionAccessors vaccForOrgCamundaBpmCamundaEnginePluginVersionAccessors = new OrgCamundaBpmCamundaEnginePluginVersionAccessors(providers, config);
        public OrgCamundaBpmCamundaEngineVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.bpm.camunda.engine.plugin</b>
         */
        public OrgCamundaBpmCamundaEnginePluginVersionAccessors getPlugin() {
            return vaccForOrgCamundaBpmCamundaEnginePluginVersionAccessors;
        }

    }

    public static class OrgCamundaBpmCamundaEnginePluginVersionAccessors extends VersionFactory  {

        public OrgCamundaBpmCamundaEnginePluginVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.camunda.bpm.camunda.engine.plugin.connect</b> with value <b>7.22.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getConnect() { return getVersion("org.camunda.bpm.camunda.engine.plugin.connect"); }

        /**
         * Version alias <b>org.camunda.bpm.camunda.engine.plugin.spin</b> with value <b>7.22.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getSpin() { return getVersion("org.camunda.bpm.camunda.engine.plugin.spin"); }

    }

    public static class OrgCamundaBpmSpringbootVersionAccessors extends VersionFactory  {

        private final OrgCamundaBpmSpringbootCamundaVersionAccessors vaccForOrgCamundaBpmSpringbootCamundaVersionAccessors = new OrgCamundaBpmSpringbootCamundaVersionAccessors(providers, config);
        public OrgCamundaBpmSpringbootVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.bpm.springboot.camunda</b>
         */
        public OrgCamundaBpmSpringbootCamundaVersionAccessors getCamunda() {
            return vaccForOrgCamundaBpmSpringbootCamundaVersionAccessors;
        }

    }

    public static class OrgCamundaBpmSpringbootCamundaVersionAccessors extends VersionFactory  {

        private final OrgCamundaBpmSpringbootCamundaBpmVersionAccessors vaccForOrgCamundaBpmSpringbootCamundaBpmVersionAccessors = new OrgCamundaBpmSpringbootCamundaBpmVersionAccessors(providers, config);
        public OrgCamundaBpmSpringbootCamundaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.bpm.springboot.camunda.bpm</b>
         */
        public OrgCamundaBpmSpringbootCamundaBpmVersionAccessors getBpm() {
            return vaccForOrgCamundaBpmSpringbootCamundaBpmVersionAccessors;
        }

    }

    public static class OrgCamundaBpmSpringbootCamundaBpmVersionAccessors extends VersionFactory  {

        private final OrgCamundaBpmSpringbootCamundaBpmSpringVersionAccessors vaccForOrgCamundaBpmSpringbootCamundaBpmSpringVersionAccessors = new OrgCamundaBpmSpringbootCamundaBpmSpringVersionAccessors(providers, config);
        public OrgCamundaBpmSpringbootCamundaBpmVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.bpm.springboot.camunda.bpm.spring</b>
         */
        public OrgCamundaBpmSpringbootCamundaBpmSpringVersionAccessors getSpring() {
            return vaccForOrgCamundaBpmSpringbootCamundaBpmSpringVersionAccessors;
        }

    }

    public static class OrgCamundaBpmSpringbootCamundaBpmSpringVersionAccessors extends VersionFactory  {

        private final OrgCamundaBpmSpringbootCamundaBpmSpringBootVersionAccessors vaccForOrgCamundaBpmSpringbootCamundaBpmSpringBootVersionAccessors = new OrgCamundaBpmSpringbootCamundaBpmSpringBootVersionAccessors(providers, config);
        public OrgCamundaBpmSpringbootCamundaBpmSpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.bpm.springboot.camunda.bpm.spring.boot</b>
         */
        public OrgCamundaBpmSpringbootCamundaBpmSpringBootVersionAccessors getBoot() {
            return vaccForOrgCamundaBpmSpringbootCamundaBpmSpringBootVersionAccessors;
        }

    }

    public static class OrgCamundaBpmSpringbootCamundaBpmSpringBootVersionAccessors extends VersionFactory  {

        private final OrgCamundaBpmSpringbootCamundaBpmSpringBootStarterVersionAccessors vaccForOrgCamundaBpmSpringbootCamundaBpmSpringBootStarterVersionAccessors = new OrgCamundaBpmSpringbootCamundaBpmSpringBootStarterVersionAccessors(providers, config);
        public OrgCamundaBpmSpringbootCamundaBpmSpringBootVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.bpm.springboot.camunda.bpm.spring.boot.starter</b>
         */
        public OrgCamundaBpmSpringbootCamundaBpmSpringBootStarterVersionAccessors getStarter() {
            return vaccForOrgCamundaBpmSpringbootCamundaBpmSpringBootStarterVersionAccessors;
        }

    }

    public static class OrgCamundaBpmSpringbootCamundaBpmSpringBootStarterVersionAccessors extends VersionFactory  {

        public OrgCamundaBpmSpringbootCamundaBpmSpringBootStarterVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.camunda.bpm.springboot.camunda.bpm.spring.boot.starter.rest</b> with value <b>7.22.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getRest() { return getVersion("org.camunda.bpm.springboot.camunda.bpm.spring.boot.starter.rest"); }

        /**
         * Version alias <b>org.camunda.bpm.springboot.camunda.bpm.spring.boot.starter.webapp</b> with value <b>7.22.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getWebapp() { return getVersion("org.camunda.bpm.springboot.camunda.bpm.spring.boot.starter.webapp"); }

    }

    public static class OrgCamundaConnectVersionAccessors extends VersionFactory  {

        private final OrgCamundaConnectCamundaVersionAccessors vaccForOrgCamundaConnectCamundaVersionAccessors = new OrgCamundaConnectCamundaVersionAccessors(providers, config);
        public OrgCamundaConnectVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.connect.camunda</b>
         */
        public OrgCamundaConnectCamundaVersionAccessors getCamunda() {
            return vaccForOrgCamundaConnectCamundaVersionAccessors;
        }

    }

    public static class OrgCamundaConnectCamundaVersionAccessors extends VersionFactory  {

        private final OrgCamundaConnectCamundaConnectVersionAccessors vaccForOrgCamundaConnectCamundaConnectVersionAccessors = new OrgCamundaConnectCamundaConnectVersionAccessors(providers, config);
        public OrgCamundaConnectCamundaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.connect.camunda.connect</b>
         */
        public OrgCamundaConnectCamundaConnectVersionAccessors getConnect() {
            return vaccForOrgCamundaConnectCamundaConnectVersionAccessors;
        }

    }

    public static class OrgCamundaConnectCamundaConnectVersionAccessors extends VersionFactory  {

        private final OrgCamundaConnectCamundaConnectHttpVersionAccessors vaccForOrgCamundaConnectCamundaConnectHttpVersionAccessors = new OrgCamundaConnectCamundaConnectHttpVersionAccessors(providers, config);
        public OrgCamundaConnectCamundaConnectVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.connect.camunda.connect.http</b>
         */
        public OrgCamundaConnectCamundaConnectHttpVersionAccessors getHttp() {
            return vaccForOrgCamundaConnectCamundaConnectHttpVersionAccessors;
        }

    }

    public static class OrgCamundaConnectCamundaConnectHttpVersionAccessors extends VersionFactory  {

        public OrgCamundaConnectCamundaConnectHttpVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.camunda.connect.camunda.connect.http.client</b> with value <b>7.22.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getClient() { return getVersion("org.camunda.connect.camunda.connect.http.client"); }

    }

    public static class OrgCamundaSpinVersionAccessors extends VersionFactory  {

        private final OrgCamundaSpinCamundaVersionAccessors vaccForOrgCamundaSpinCamundaVersionAccessors = new OrgCamundaSpinCamundaVersionAccessors(providers, config);
        public OrgCamundaSpinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.spin.camunda</b>
         */
        public OrgCamundaSpinCamundaVersionAccessors getCamunda() {
            return vaccForOrgCamundaSpinCamundaVersionAccessors;
        }

    }

    public static class OrgCamundaSpinCamundaVersionAccessors extends VersionFactory  {

        private final OrgCamundaSpinCamundaSpinVersionAccessors vaccForOrgCamundaSpinCamundaSpinVersionAccessors = new OrgCamundaSpinCamundaSpinVersionAccessors(providers, config);
        public OrgCamundaSpinCamundaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.spin.camunda.spin</b>
         */
        public OrgCamundaSpinCamundaSpinVersionAccessors getSpin() {
            return vaccForOrgCamundaSpinCamundaSpinVersionAccessors;
        }

    }

    public static class OrgCamundaSpinCamundaSpinVersionAccessors extends VersionFactory  {

        private final OrgCamundaSpinCamundaSpinDataformatVersionAccessors vaccForOrgCamundaSpinCamundaSpinDataformatVersionAccessors = new OrgCamundaSpinCamundaSpinDataformatVersionAccessors(providers, config);
        public OrgCamundaSpinCamundaSpinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.camunda.spin.camunda.spin.dataformat</b>
         */
        public OrgCamundaSpinCamundaSpinDataformatVersionAccessors getDataformat() {
            return vaccForOrgCamundaSpinCamundaSpinDataformatVersionAccessors;
        }

    }

    public static class OrgCamundaSpinCamundaSpinDataformatVersionAccessors extends VersionFactory  {

        public OrgCamundaSpinCamundaSpinDataformatVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.camunda.spin.camunda.spin.dataformat.all</b> with value <b>7.22.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAll() { return getVersion("org.camunda.spin.camunda.spin.dataformat.all"); }

    }

    public static class OrgOpenjdkVersionAccessors extends VersionFactory  {

        private final OrgOpenjdkNashornVersionAccessors vaccForOrgOpenjdkNashornVersionAccessors = new OrgOpenjdkNashornVersionAccessors(providers, config);
        public OrgOpenjdkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.openjdk.nashorn</b>
         */
        public OrgOpenjdkNashornVersionAccessors getNashorn() {
            return vaccForOrgOpenjdkNashornVersionAccessors;
        }

    }

    public static class OrgOpenjdkNashornVersionAccessors extends VersionFactory  {

        private final OrgOpenjdkNashornNashornVersionAccessors vaccForOrgOpenjdkNashornNashornVersionAccessors = new OrgOpenjdkNashornNashornVersionAccessors(providers, config);
        public OrgOpenjdkNashornVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.openjdk.nashorn.nashorn</b>
         */
        public OrgOpenjdkNashornNashornVersionAccessors getNashorn() {
            return vaccForOrgOpenjdkNashornNashornVersionAccessors;
        }

    }

    public static class OrgOpenjdkNashornNashornVersionAccessors extends VersionFactory  {

        public OrgOpenjdkNashornNashornVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.openjdk.nashorn.nashorn.core</b> with value <b>15.4</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCore() { return getVersion("org.openjdk.nashorn.nashorn.core"); }

    }

    public static class OrgSpringframeworkVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkBootVersionAccessors vaccForOrgSpringframeworkBootVersionAccessors = new OrgSpringframeworkBootVersionAccessors(providers, config);
        public OrgSpringframeworkVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.springframework.boot</b>
         */
        public OrgSpringframeworkBootVersionAccessors getBoot() {
            return vaccForOrgSpringframeworkBootVersionAccessors;
        }

    }

    public static class OrgSpringframeworkBootVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkBootSpringVersionAccessors vaccForOrgSpringframeworkBootSpringVersionAccessors = new OrgSpringframeworkBootSpringVersionAccessors(providers, config);
        public OrgSpringframeworkBootVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.springframework.boot.spring</b>
         */
        public OrgSpringframeworkBootSpringVersionAccessors getSpring() {
            return vaccForOrgSpringframeworkBootSpringVersionAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkBootSpringBootVersionAccessors vaccForOrgSpringframeworkBootSpringBootVersionAccessors = new OrgSpringframeworkBootSpringBootVersionAccessors(providers, config);
        public OrgSpringframeworkBootSpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.springframework.boot.spring.boot</b>
         */
        public OrgSpringframeworkBootSpringBootVersionAccessors getBoot() {
            return vaccForOrgSpringframeworkBootSpringBootVersionAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootVersionAccessors extends VersionFactory  {

        private final OrgSpringframeworkBootSpringBootStarterVersionAccessors vaccForOrgSpringframeworkBootSpringBootStarterVersionAccessors = new OrgSpringframeworkBootSpringBootStarterVersionAccessors(providers, config);
        public OrgSpringframeworkBootSpringBootVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.springframework.boot.spring.boot.starter</b>
         */
        public OrgSpringframeworkBootSpringBootStarterVersionAccessors getStarter() {
            return vaccForOrgSpringframeworkBootSpringBootStarterVersionAccessors;
        }

    }

    public static class OrgSpringframeworkBootSpringBootStarterVersionAccessors extends VersionFactory  {

        public OrgSpringframeworkBootSpringBootStarterVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.springframework.boot.spring.boot.starter.jdbc</b> with value <b>3.3.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJdbc() { return getVersion("org.springframework.boot.spring.boot.starter.jdbc"); }

        /**
         * Version alias <b>org.springframework.boot.spring.boot.starter.web</b> with value <b>3.3.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getWeb() { return getVersion("org.springframework.boot.spring.boot.starter.web"); }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
